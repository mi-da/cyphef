/**
 */
package patternGenerator.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import patternGenerator.util.PatternGeneratorAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternGeneratorItemProviderAdapterFactory extends PatternGeneratorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.ManagedSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagedSystemItemProvider managedSystemItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.ManagedSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManagedSystemAdapter() {
		if (managedSystemItemProvider == null) {
			managedSystemItemProvider = new ManagedSystemItemProvider(this);
		}

		return managedSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Monitor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorItemProvider monitorItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Monitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonitorAdapter() {
		if (monitorItemProvider == null) {
			monitorItemProvider = new MonitorItemProvider(this);
		}

		return monitorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Analyze} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyzeItemProvider analyzeItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Analyze}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalyzeAdapter() {
		if (analyzeItemProvider == null) {
			analyzeItemProvider = new AnalyzeItemProvider(this);
		}

		return analyzeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Plan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemProvider planItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanAdapter() {
		if (planItemProvider == null) {
			planItemProvider = new PlanItemProvider(this);
		}

		return planItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Execute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteItemProvider executeItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Execute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecuteAdapter() {
		if (executeItemProvider == null) {
			executeItemProvider = new ExecuteItemProvider(this);
		}

		return executeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Knowledge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeItemProvider knowledgeItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKnowledgeAdapter() {
		if (knowledgeItemProvider == null) {
			knowledgeItemProvider = new KnowledgeItemProvider(this);
		}

		return knowledgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.InterComponentInteraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterComponentInteractionItemProvider interComponentInteractionItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.InterComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterComponentInteractionAdapter() {
		if (interComponentInteractionItemProvider == null) {
			interComponentInteractionItemProvider = new InterComponentInteractionItemProvider(this);
		}

		return interComponentInteractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.ReadWriteInteraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadWriteInteractionItemProvider readWriteInteractionItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.ReadWriteInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadWriteInteractionAdapter() {
		if (readWriteInteractionItemProvider == null) {
			readWriteInteractionItemProvider = new ReadWriteInteractionItemProvider(this);
		}

		return readWriteInteractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Delegation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationItemProvider delegationItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Delegation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegationAdapter() {
		if (delegationItemProvider == null) {
			delegationItemProvider = new DelegationItemProvider(this);
		}

		return delegationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link patternGenerator.Coordination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationItemProvider coordinationItemProvider;

	/**
	 * This creates an adapter for a {@link patternGenerator.Coordination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoordinationAdapter() {
		if (coordinationItemProvider == null) {
			coordinationItemProvider = new CoordinationItemProvider(this);
		}

		return coordinationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (managedSystemItemProvider != null) managedSystemItemProvider.dispose();
		if (monitorItemProvider != null) monitorItemProvider.dispose();
		if (analyzeItemProvider != null) analyzeItemProvider.dispose();
		if (planItemProvider != null) planItemProvider.dispose();
		if (executeItemProvider != null) executeItemProvider.dispose();
		if (knowledgeItemProvider != null) knowledgeItemProvider.dispose();
		if (interComponentInteractionItemProvider != null) interComponentInteractionItemProvider.dispose();
		if (readWriteInteractionItemProvider != null) readWriteInteractionItemProvider.dispose();
		if (delegationItemProvider != null) delegationItemProvider.dispose();
		if (coordinationItemProvider != null) coordinationItemProvider.dispose();
	}

}
