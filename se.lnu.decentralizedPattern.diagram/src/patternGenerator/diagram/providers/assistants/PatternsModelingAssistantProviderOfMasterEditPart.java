package patternGenerator.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PatternsModelingAssistantProviderOfMasterEditPart
		extends patternGenerator.diagram.providers.PatternsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((patternGenerator.diagram.edit.parts.MasterEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(patternGenerator.diagram.edit.parts.MasterEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((patternGenerator.diagram.edit.parts.MasterEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(patternGenerator.diagram.edit.parts.MasterEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		}
		return types;
	}

}
